function solution(A, K) {
    const shiftedArray = [];
    let shiftedIndex;
  
    A.forEach((element, index) => {
      shiftedIndex = (index + K) % A.length;
      shiftedArray[shiftedIndex] = A[index];
    });
  
    return shiftedArray;
  }