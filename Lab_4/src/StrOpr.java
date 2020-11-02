import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StrOpr {

	public static void First(String str) {
		//�
		System.out.print("Last symbol is: " + str.charAt(str.length()-1) + "\n");
		//�
		if(str.endsWith("!!!"))
			 System.out.print("String has \"!!!\" at end \n");
		else System.out.print("There is no \"!!!\" at end \n");
		//�
		if(str.startsWith("I like"))
			 System.out.print("String start with \"I like\"\n");
		else System.out.print("There is no \"I like\" at beginning\n");	
		//�
		if(str.contains("Java"))
			 System.out.print("String contain \"Java\"\n");
		else System.out.print("String doesn`t contain \"Java\"\n");
		//�
		var JvaIndx = str.indexOf("Java");
		System.out.print("position of \"Java\" is: " +JvaIndx+ "\n");
		//�
		System.out.print(str.replace('a','o')+ "\n");
		//�
		System.out.print(str.toUpperCase()+ "\n");
		//�
		System.out.print(str.toLowerCase()+ "\n");
		//�
		System.out.print(str.substring(JvaIndx,JvaIndx+4)+ "\n");
	}
	
	public static void Second(String path,String LookingWord) throws IOException {
		String Line = null;
	    int counter = 0; //������� ��������� ��������� �����
	    File file = new File(path);
	    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
	    StringBuilder out = new StringBuilder(); //�������� ��������� �����
	    while((Line = br.readLine())!= null) //������ ����� �� �������� ������ � tmp
	    {
	     if(Line.contains(LookingWord) && ++counter % 2 == 0) { //���� ��� ��������� "������ ������"
	        out.append(Line.replaceAll(LookingWord, "OOP"));//����� ��� � �������� ����� � ��������
	        out.append("\n");
	        continue;
	     }
	        out.append(Line + "\n"); //����� ��� � �������� ����� � ��������
	    }
	    br.close();
	    path = out.toString(); //�� ��������� ������ ������ ������
	    System.out.print(path);
	}

	public static void Third(String str,String LookingWord) {
		StringBuilder out = new StringBuilder();
		while(str.contains(LookingWord)) {
			var indx = str.indexOf(LookingWord);
			str = str.substring(indx);
			indx = str.indexOf(',');
			if(indx == -1)
				indx = str.indexOf('.');
			out.append(str.substring(0, indx)+"\n");
			str = str.substring(indx);
		}
		System.out.print(out);
	}

	public static void Fourth(String str) {
		var WordList = SplitWords(str,' ');
        String wordMinCharVar = (String) WordList.get(0);
        int indexMinCharVar = 0;
        int sizeMinCharVar = new HashSet<String> (Arrays.asList (WordList.get(0).split (""))).size();

      for (int i = 1; i < WordList.size(); i++) {
          Set<String> set = new HashSet<String> (Arrays.asList (WordList.get(i).split ("")));
          if (set.size () < sizeMinCharVar) {
              indexMinCharVar = i;
              sizeMinCharVar = set.size ();
          }
      }
      System.out.println (wordMinCharVar);
	}
	
	public static void Fifth(String str) {
		var WordList = SplitWords(str,' ');
		int wordsCount = 0;
		for (String word : WordList) {
			for (Character letter : word.toCharArray ()) {
				if (((letter >= '�') && (letter <= '�')) || ((letter >= '�') && (letter <= '�')) || Character.isDigit(letter)) {
					wordsCount--;
				  break;
				}
			}
			wordsCount++;
		}
		System.out.print(wordsCount + "\n");
	}
	

	public static void Sixth(String str) {
		var WordList = SplitWords(str,' ');
		for (String word : WordList) {
			for (Character letter : word.toCharArray ()) {
				if (((letter >= '�') && (letter <= '�')) || ((letter >= '�') && (letter <= '�'))) 
					break;
			var temp = new StringBuilder(word).reverse();
			if(word.equals(temp.toString()) && temp.length() >1) {
				System.out.print(word);
			return;
			}
			}
		}
	}
	
	private static List<String> SplitWords(String str,char splitter){
		List<String> list = new ArrayList<>();
		while(str.length() != 0) {
			var indx = str.indexOf(splitter);
			if (indx == 0) {
				str = str.substring(1);
				continue;
			}
			if (indx == -1) {
				list.add(str);
				return list;
				}
			list.add(str.substring(0, indx));
			str = str.substring(indx);
		}
		return list;
	}


}
