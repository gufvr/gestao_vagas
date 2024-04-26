package br.com.gufvr.gestao_vagas.exceptions;

public class UserFoundException extends RuntimeException {
  public UserFoundException() {
    super("Uusário já existe");
  }
}
