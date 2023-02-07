package programmers;

public class 문자열_나누기 {

  public int solution(String s) {
    int answer = 0;
    int sIdx = 0, eIdx = 0;
    while (eIdx < s.length()) {
      char x = s.charAt(sIdx);
      int cnt = 0;
      for (char w : s.substring(sIdx).toCharArray()) {
        eIdx++;
        if (x == w) {
          cnt++;
        } else {
          cnt--;
        }
        if (cnt == 0) {
          break;
        }
      }
      answer++;
      sIdx = eIdx;
    }

    return answer;
  }

  public int solution2(String s) {
    int answer = 0;
    int start = 0, end = s.length();
    char x = s.charAt(start);
    int cnt = 0;
    for (char c : s.toCharArray()) {
      if (c == x) {
        cnt++;
      } else {
        cnt--;
      }
      if (cnt == 0 || start == end - 1) {
        answer++;
        if (start + 1 < end) {
          x = s.charAt(start + 1);
        }
      }
      start++;
    }


    return answer;
  }

  public static void main(String[] args) {
    문자열_나누기 m = new 문자열_나누기();
    System.out.println(m.solution("banana"));
    System.out.println(m.solution("abracadabra"));
    System.out.println(m.solution("aaabbaccccabba"));

    System.out.println(m.solution2("banana"));
    System.out.println(m.solution2("abracadabra"));
    System.out.println(m.solution2("aaabbaccccabba"));

  }
}
