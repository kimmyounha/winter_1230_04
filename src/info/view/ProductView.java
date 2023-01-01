package info.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import info.vo.ProductVO;
import info.vo.ProductDAO;

public class ProductView {
	public static final int CONTINUE = 1;
	public static final int EXIT = 0;

	public void view(ArrayList<ProductVO> pvoList) {

		for (ProductVO vo : pvoList) {
			System.out.print("");
			System.out.print("");

		}
	}

}
