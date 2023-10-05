package com.envers.enversteste.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public static String getCurrentUsername() {
        //Lógica para extrair nome do usuário logado.
        return "UsuarioAtual";
    }

}
