package Exception;
import java.util.*;
import java.io.*;

public class Lab8_3 {
	int a,b;
	double res;
	
	Lab8_3(int x,int y){
		a = x;
		b = y;
	}
	void add() {
		try {
			if(b == (int)b && a == (int) a) {
				res = a + b;
				System.out.println(res);
			}
			else {
				throw new InputMissmatchException();
			}
		}catch(InputMissmatchException e) {
			e.print();
		}
	}
	void sub() {
		try {
			if(a > 0 && b > 0) {
				res = a - b;
				System.out.println(res);
			}
			else {
				throw new IllegalArgumentException();
			}
		}catch(IllegalArgumentException e) {
			e.print();
		}
	}
	void mul() {
		res = a * b;
		System.out.println(res);
	}
	void div() {
		try {
			if(b == 0) {
				throw new DevideByeZeroException();
			}else {
				res = a / b;
				System.out.println(res);
			}
		}catch(DevideByeZeroException e) {
			e.print();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab8_3 i = new Lab8_3(10,5);
		i.add();
		i.sub();
		i.mul();
		i.div();
	}

}
