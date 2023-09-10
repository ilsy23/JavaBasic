package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BufferedQuiz {

	public static void main(String[] args) {

		/*
		         1. LocalDate클래스를 이용해서 file폴더 내에 하위 경로로
		          오늘 날짜 20230908file 이라는 이름으로 폴더를 생성하세요.
		         2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.
		         3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로
		          파일을 작성합니다. 
		          (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 
		           연결해 주시면 됩니다.)
		                각 문장은 줄 개행을 포함합니다.
		         4. '그만'으로 파일이 작성되었다면, 아무 방법으로나 
		          파일을 읽어서 콘솔에 출력해 보세요
		 */
		
		//폴더 생성
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		String folderName = LocalDate.now().format(dtf) + "file";
		
		File fileFolder = new File("C:/Mywork/" + folderName);
		if(!fileFolder.exists()) {
			fileFolder.mkdir();
			System.out.println(folderName + "폴더 생성 완료!");
		}else {
			System.out.println("이미 존재하는 폴더입니다.");
		}
		
		//파일명 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명: ");
		String fileName = sc.next();
		sc.nextLine();
		
		//파일 작성
		FileWriter fw = null;
		BufferedWriter bw = null;
		

			try {
				fw = new FileWriter("C:/Mywork/" + folderName + "/" + fileName + ".txt" );
				bw = new BufferedWriter(fw);
				
				String paragraph = "";
				while(true) {
					System.out.print("문장 입력: ");
					String str = sc.nextLine();
					
					if(str.equals("그만")) {
						System.out.println("입력 종료!");
						break;
					}
					paragraph += (str + "\r\n");
				}
				
				bw.write(paragraph);
				System.out.println("파일 출력 완료!");
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					bw.close();
					fw.close();
					sc.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		//파일 출력
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("C:/Mywork/" + folderName + "/" + fileName + ".txt");
			br = new BufferedReader(fr);
			
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
