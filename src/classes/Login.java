/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author o_0fe
 */
public class Login {
    
    private int id;
    private String userLogin;
    private int userSenha;
    private int id_condomy;
    private int nivel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_condomy() {
        return id_condomy;
    }

    public void setId_condomy(int id_condomy) {
        this.id_condomy = id_condomy;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    
    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public int getUserSenha() {
        return userSenha;
    }

    public void setUserSenha(int userSenha) {
        this.userSenha = userSenha;
    }
    
    
    
}
