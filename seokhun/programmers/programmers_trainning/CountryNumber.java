/*public String solution(int n) {
    String answer="";
    int mok=n/3+1;
    int nmg=n%3;
    String num124="";
    ArrayList<String> list = new ArrayList<>();
    list.add("1");
    list.add("2");
    list.add("4");

    if(nmg==1){
        num124 = list.get(0);
    }else if(nmg==2){
        num124 = list.get(1);
    }else {
        mok -= 1;
        nmg=3;
        num124 = list.get(2);
    }

    for(int i=0; i<mok; i++){

        answer= answer+num124;
        System.out.println("answer : "+ answer);
    }

    return answer;
}

처음에는 위와 같이 작성해 public void 숫자123을_결과124로_표현()를 통과시켰는데
2번째 테스트부터 도저히 for문으로 못하겠어서 while문으로 바꿨는데 정답이 되어버림..
이렇게 하는게 아닌거같은데*/
public class CountryNumber {
    public String solution(int inputNumber) {
        String answer="";
        String countryNumber[] = {"4","1","2"};
        int nmg=0;

        while(inputNumber>0){
            nmg = inputNumber%3;
            inputNumber = inputNumber/3;
            if(nmg==0){
                inputNumber-=1;
            }
            answer=countryNumber[nmg]+answer;

        }
        return answer;
    }
}
