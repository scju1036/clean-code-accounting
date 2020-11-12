package com.exxeta.interactor;

import com.exxeta.domain.AccountingService;
import com.exxeta.model.Action;
import com.exxeta.model.AccountingDTO;
import com.exxeta.ui.UserInterface;

import java.util.Date;

public class Interactor {

    /**
     * hb einzahlung 4000
     * hb auszahlung 400 Miete
     * hb übersicht 9 2020
     **/
    public static void start(String[] args) {
        if(!isArgsMinSize(args)){
            UserInterface.printErrorWrongArgumentNumber();
            return;
        }
        Action action = Action.createAction(args[0]);
        AccountingDTO accountingDTO = createAccounting(args, action);
        processRequest(accountingDTO, action);
    }

    public static boolean isArgsMinSize(String[] args) {
        return args.length > 1;
    }

    public static AccountingDTO createAccounting(String[] args, Action action){
        switch (action){
            case DEPOSIT:
                return new AccountingDTO(new Date(), Double.parseDouble(args[1]), "");
            case WITHDRAWL:
                return new AccountingDTO();
            case OVERVIEW:
            default:
                return new AccountingDTO();
        }
    }

    public static void processRequest(AccountingDTO accountingDTO, Action action) {
        switch (action) {
            case DEPOSIT:
                Double balance = AccountingService.deposit(accountingDTO);
                UserInterface.printDeposit(balance);
            case WITHDRAWL:
            case OVERVIEW:
        }
    }
}
