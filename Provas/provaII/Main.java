package provaII;

public class Main {

	public static void main(String[] args) {

		Cliente a = new Cliente("A", Cliente.OUTRO, 0, false);
		Cliente b = new Cliente("B", Cliente.MERCADO, 0, false);
		Cliente c = new Cliente("C", Cliente.FARMACIA, 0, false);
		Cliente d = new Cliente("D", Cliente.FARMACIA, 100, true);

		Perfumaria pf = new Perfumaria("PF", 25.00, 10);
		Alimenticio al = new Alimenticio("AL", 15.00, 10);
		Medicamento m1 = new Medicamento("M1", 33.00, 10, false);
		Medicamento m2 = new Medicamento("M2", 12.00, 10, true);

		pf.vender(a, 4);
		pf.vender(b, 4);
		pf.vender(c, 4);
		pf.vender(d, 4);

		al.vender(a, 4);
		al.vender(b, 4);
		al.vender(c, 4);
		al.vender(d, 4);

		m1.vender(a, 4);
		m1.vender(b, 4);
		m1.vender(c, 4);
		m1.vender(d, 4);

		m2.vender(a, 4);
		m2.vender(b, 4);
		m2.vender(c, 4);
		m2.vender(d, 4);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		System.out.println(pf);
		System.out.println(al);
		System.out.println(m1);
		System.out.println(m2);

		a.pagamento(b.getSaldoDevedor());
		b.pagamento(c.getSaldoDevedor());
		c.pagamento(d.getSaldoDevedor());
		d.pagamento(a.getSaldoDevedor());

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		pf.vender(a, 1);
		pf.vender(b, 1);
		pf.vender(c, 1);
		pf.vender(d, 1);

		al.vender(a, 1);
		al.vender(b, 1);
		al.vender(c, 1);
		al.vender(d, 1);

		m1.vender(a, 1);
		m1.vender(b, 1);
		m1.vender(c, 1);
		m1.vender(d, 1);

		m2.vender(a, 1);
		m2.vender(b, 1);
		m2.vender(c, 1);
		m2.vender(d, 1);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		System.out.println(pf);
		System.out.println(al);
		System.out.println(m1);
		System.out.println(m2);

	}

}
