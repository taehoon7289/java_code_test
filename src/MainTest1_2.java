package src;

public class MainTest1_2 {

  public static void main(String[] args) {
    new Test().solution();
  }

  static class Test {
    public void solution() {
      String[] companies = new String[]{"A fabdec 2", "B cebdfa 2", "C ecfadb 2"};
      String[] applicants = new String[]{"a BAC 1", "b BAC 3", "c BCA 2", "d ABC 3", "d ABC 3", "e BCA 3", "f ABC 2"};
      // 1. 지원자가 우선 지원하게됨
      // 2. 기업은 잠정선택 명수 제외하고 TO 있으면 잠정선택 더 하고, 없으면 거절
      // 3. 입사 희망 기업수 남은 카운트가 있다면 다음 라운드에서 재 지원.

      // 같은 라운드에서 기업에서 지원자 뽑는 기준은 기업별 지원자 선호도 순서대로
      // 최대 라운드는 applicants 최대 희망 기업수 또는 지원 가능 기업없을때 까지

      // - company, applicant 클래스 각각 만들어서 obj 만들기
      // - while 문 돌리기
      // -- 지원자 조회해서 희망기업 카운트 체크 -> company 에 append시킴
      // -- append 하기 전에 모아서 배열로 append시키기 -> 그래야 들어온 지원자별로 선호도 체크 가능
      // -- append 될때마다 채용조건 체크해서 잠정선택 여부 리턴해주기
      // -- 체용 조건은 TO 확인
      // -- 잠정선택 안되면 다시 돌기
      // - 결과 출력은 설명 확인
      String temp = "2";
      Integer.parseInt(temp);
    }
  }

  static class Company {
    String companyName; // 기업이름
    String[] selectedApplicants; // 잠정선택 지원자
    int toCount; // 채용인원수
  }

  static class Applicant {
    String applicantName; // 지원자이름
    String[] preferCompany; // 기업에 대한 선호도
    int wishCount; // 입사 희망 기업수
  }


}
