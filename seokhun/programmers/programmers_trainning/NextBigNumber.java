public class NextBigNumber {
    public int solution(int inputNumber) {
        int answer=0;
        String checkBinaryResult = checkBinary(inputNumber);
        // String binaryInputNumber = Integer.toBinaryString(inputNumber);
        int countOne = countIntOne(checkBinaryResult);
        while(true){

            int nextInputNumber = inputNumber + 1;
            String nextBinaryInputNumber = checkBinary(nextInputNumber);

            int countTwo = countIntOne(nextBinaryInputNumber);

            //1의 개수 같으면 그 수가 정답
            if(countOne==countTwo){
                answer =  nextInputNumber;
                break;

                //아니면 다음 수를 비교하기 위해 +1
            }else{
                inputNumber++;
                // System.out.println("inputNumber : "+ inputNumber);
            }
        }

        return answer;
    }

    //10진수를 2진수로 변환해주는 메소드
    public String checkBinary(int inputNumber) {
        return Integer.toBinaryString(inputNumber);
    }

    //2진수의 1의 갯수를 카운트 해주는 메소드
    public int countIntOne(String binaryNumbers){
        int count=0;
        int length = binaryNumbers.length();
        for(int i=0; i<length; i++){
            if(binaryNumbers.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}


//위 문제는 효율성에서 실패
/*
* int count = Integer.bitCount(n);
		while ( true ) {
			n++;
			if ( count == Integer.bitCount(n) )
				break;
		}
		return n;

		bitcount함수는 숫자를 2진수로 바꿔준다음 1의 갯수를 카운트해줌
		수동으로 할 필요가없었다.

		다만, 알고리즘에서는 모든 경우에 대해서는 통과할 지라도 위와같이 적절한 메소드를 사용안하고 했을경우
		효율성에서 실패할 수 있음.
* */
