package br.com.treinar.aula.pool;

public class ConcatenacaoLeo {
	public static void main(String[] args) {
		String a = "Leonardo";
		String b = "Gonçalves";
		String c = "Bráz";
		StringBuilder sb = new StringBuilder();
		sb.append(a).append(" ").append(b).append(" ").append(c);
		System.out.println(sb);
	}
}
