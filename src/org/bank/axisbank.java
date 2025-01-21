package org.bank;

public class axisbank extends bankinfo {

@Override
public void deposit(int dep) {
 System.out.println("deposit amount in my acc"+dep);
 super.savings(4378297);
	super.fixied(376522);
}
public static void main(String[] args) {
	axisbank a =new axisbank();
	a.deposit(2875329);
}

}
