function swap(arr, i, j) {
  const temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
}

function bubbleSort(arr) {
  let isSorted;

  for (let i = 0; i < arr.length; i++) {
    isSorted = true;

    for (let j = 0; j < arr.length - 1 - i; j++) {
      if (arr[j] > arr[j + 1]) {
        swap(arr, j, j + 1)
        isSorted = false;
      }
    }

    if (isSorted) {
      break;
    }
  }
  return arr;
}

//Use this version if you want to preserve the original array
//and obtain a sorted version as a separate result.
function bubbleSort2(arr) {
  const resultArr = [...arr];

  for (let i = 0; i < resultArr.length; i++) {
    for (let j = i + 1; j < resultArr.length; j++) {
      if (resultArr[i] > resultArr[j]) {
        // Swap elements
        const temp = resultArr[i];
        resultArr[i] = resultArr[j];
        resultArr[j] = temp;
      }
    }
  }
  return resultArr;
}

const arr = [3, 10, -3, 48, 5, 33, 99];

console.log(bubbleSort2(arr));
