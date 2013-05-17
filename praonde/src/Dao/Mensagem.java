
package Dao;

public class Mensagem {
    private int idMensagem;
    private int idUsuario1;
    private int idUsuario2;
    private String dataHora;
    private String mensagem;
    private int lida;
	public int getIdMensagem() {
		return idMensagem;
	}
	public void setIdMensagem(int idMensagem) {
		this.idMensagem = idMensagem;
	}
	public int getIdUsuario1() {
		return idUsuario1;
	}
	public void setIdUsuario1(int idUsuario1) {
		this.idUsuario1 = idUsuario1;
	}
	public int getIdUsuario2() {
		return idUsuario2;
	}
	public void setIdUsuario2(int idUsuario2) {
		this.idUsuario2 = idUsuario2;
	}
	public String getDataHora() {
		return dataHora;
	}
	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public int getLida() {
		return lida;
	}
	public void setLida(int lida) {
		this.lida = lida;
	}
}
