package application;

import java.util.Date;

import entities.Pedidos;
import entities.enums.OrdemStatus;

public class ProgramaPedidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pedidos pedidos = new Pedidos(1080, new Date(), OrdemStatus.AGUARDANDO_PAGAMENTO);

		System.out.println(pedidos);

		OrdemStatus os1 = OrdemStatus.ENTREGUE;
		OrdemStatus os2 = OrdemStatus.valueOf("ENTREGUE");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
