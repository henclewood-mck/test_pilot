class Solution {
    hasCloseElements(numbers, threshold) {
        for (let i = 0; i < numbers.length; i++) {
            for (let j = i + 1; j < numbers.length; j++) {
                let distance = numbers[i] - numbers[j];
                if (distance < threshold) return true;
            }
        }
        return false;
    }
}
