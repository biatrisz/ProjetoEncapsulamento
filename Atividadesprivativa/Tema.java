package Atividadesprivativa;

public class Tema {
private long id;	
private String nome;
private Double ValorAluguel;
private String CorToalha;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Double getValorAluguel() {
	return ValorAluguel;
}
public void setValorAluguel(Double valorAluguel) {
	ValorAluguel = valorAluguel;
}
public String getCorToalha() {
	return CorToalha;
}
public void setCorToalha(String corToalha) {
	CorToalha = corToalha;
}
}