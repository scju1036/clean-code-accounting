package com.exxeta.interactor;

import com.exxeta.domain.Action;
import com.exxeta.domain.RequestDTO;
import com.exxeta.domain.WrongArgumentException;
import com.exxeta.ui.UserInterface;

public class Interactor {

    /**
     * hb einzahlung 4000
     * hb auszahlung 400 Miete
     * hb übersicht 9 2020
     **/
    public static void start(String[] args) {
        try{
            RequestDTO requestDTO = createRequest(args);
            processRequest(requestDTO);
        }catch (WrongArgumentException e){
            UserInterface.printErrorWrongArgumentNumber();
        }
    }

    public static boolean isArgsMinSize(String[] args) {
        return args.length > 1;
    }

    public static RequestDTO createRequest(String[] args) throws WrongArgumentException{
        if(args.length < 2){
            throw new WrongArgumentException();
        }

        Action action = Action.createAction(args[0]);
        switch (action){
            case DEPOSIT:
                return new RequestDTO(action, Double.parseDouble(args[1]), null, null);
            case WITHDRAWL:
                return new RequestDTO();
            case OVERVIEW:
            default:
                return new RequestDTO();
        }
    }

    public static void processRequest(RequestDTO requestDTO) {
        switch (requestDTO.getAction()) {
            case DEPOSIT:
            case WITHDRAWL:
            case OVERVIEW:
        }
    }
}
