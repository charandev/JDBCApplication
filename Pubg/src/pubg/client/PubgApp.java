package pubg.client;

import java.sql.SQLException;
import java.util.Scanner;

import pubg.entity.Pubg;
import pubg.exception.client.ClientException;
import pubg.exception.service.ServiceException;
import pubg.service.Service;
import pubg.service.impl.ServiceImpl;

public class PubgApp {
	static Service pubgService = new ServiceImpl();

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int opt;
		do {
			System.out.println(
					"1. CREATE PLAYER\n2. GET ALL\n3. GET PLAYER WITH HIGHEST KILLS\n4. MODIFY PLAYERS HIGHEST KILLS\n5. DELETE PLAYER\n\nENTER THE OPTION:");
			opt = scan.nextInt();

			switch (opt) {
			case 1:
				try {
					createPlayer();
				} catch (ClientException e) {
					e.printStackTrace();
				}
				break;
//			case 2:
//				getAll();
//				break;
//			case 3:
//				getPlayerHSkill();
//				break;
//			case 4:
//				modifyHkills();
//				break;
//			case 5:
//				try {
//					deletePlayer();
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				break;

			default:
				break;
			}
		} while (opt != 6);
	}

//	private static void deletePlayer() throws SQLException {
//		scan.nextLine();
//		System.out.println("Enter the name of the player you want to delete:");
//		String name = scan.nextLine();
//		int rows = 0;
//		try {
//			rows = pubgService.deletePlayer(name);
//		} catch (DAOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(rows);
//	}
//
//	private static void modifyHkills() {
//		scan.nextLine();
//		System.out.println("Enter User Name:");
//		String uname = scan.nextLine();
//		System.out.println("Enter the updated kills:");
//		int kills = scan.nextInt();
//		try {
//			System.out.println(pubgService.modifyHKills(uname, kills));
//		} catch (DAOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//	private static void getPlayerHSkill() {
////		System.out.println("Enter User Name:");
////		String uname = scan.nextLine();
//		String hkill = "";
//		try {
//			hkill = pubgService.getPlayerHKills();
//		} catch (DAOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(hkill);
//
//	}
//
//	private static void getAll() {
//		System.out.println("All the data:");
//
//		try {
//			try {
//				System.out.println(pubgService.getAll());
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (DAOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}

	private static void createPlayer() throws ClientException {
		Pubg pubg = new Pubg();
		System.out.println("Enter the ID:");
		int id = scan.nextInt();
		pubg.setId(id);
		scan.nextLine();
		System.out.println("Enter the user name:");
		String uname = scan.nextLine();
		pubg.setUserName(uname);

		System.out.println("Enter the highest kills");
		int hkills = scan.nextInt();
		pubg.sethKills(hkills);

		try {
			System.out.println(pubgService.createPlayer(pubg));
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
