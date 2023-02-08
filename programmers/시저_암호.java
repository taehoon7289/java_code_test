package programmers;

public class 시저_암호 {

  public String solution(String s, int n) {
    String answer = "";
    Character[] upperAlphas = new Character[]{'A', 'B', 'C', 'D', 'E', 'F', 'G',
        'H', 'I', 'J',
        'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
        'Y', 'Z'};
    Character[] lowerAlphas = new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g',
        'h', 'i', 'j',
        'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
        'y', 'z'};
    for (char c : s.toCharArray()) {
      if (Character.isUpperCase(c)) {
        // 대문자
        for (int i = 0; i < upperAlphas.length; i++) {
          if (upperAlphas[i] == c) {
            int index = i + n;
            if (index >= upperAlphas.length) {
              index -= upperAlphas.length;
            }
            answer += upperAlphas[index];
          }
        }
      } else if (Character.isLowerCase(c)) {
        // 소문자
        for (int i = 0; i < lowerAlphas.length; i++) {
          if (lowerAlphas[i] == c) {
            int index = i + n;
            if (index >= lowerAlphas.length) {
              index -= lowerAlphas.length;
            }
            answer += lowerAlphas[index];
          }
        }
      } else {
        answer += c;
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    시저_암호 t = new 시저_암호();
    System.out.println(t.solution("AB", 1));
    System.out.println(t.solution("z", 1));
    System.out.println(t.solution("a B z", 4));
  }

}
