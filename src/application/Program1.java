package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.print("Entre com o id do derpartamento que deseja buscar: ");
		int id = sc.nextInt();
		Department dep = departmentDao.findById(id);
		System.out.println("========Resultado findById========");
		System.out.println(dep);
		sc.close();
	}
}
