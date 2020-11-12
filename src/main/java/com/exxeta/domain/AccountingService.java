package com.exxeta.domain;

import com.exxeta.model.AccountingDTO;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class AccountingService {

    public static void saveAccounting(AccountingDTO accounting) {
        String line = accounting.toString();
        FileService.saveLine(line);
    }

    public static List<AccountingDTO> loadAccountings() {
        List<String> lines = FileService.readFile("accounting.csv");
        return mapLinesToAccountings(lines);
    }

    public static Double calculateBalance(List<AccountingDTO> accountings) {
        Double balance = 0.0;
        for(AccountingDTO accounting : accountings) {
            balance += accounting.getAmount();
        }
        return balance;
    }


    private static List<AccountingDTO> mapLinesToAccountings(List<String> lines) {
        // We don't want the headers to be included.
        lines.remove(0);
        return lines.stream().map(line -> {
            String[] entries = line.split(";");
            return new AccountingDTO(new Date(entries[0]), Double.parseDouble(entries[1]), entries[2]);
        }).collect(Collectors.toList());
    }
}
