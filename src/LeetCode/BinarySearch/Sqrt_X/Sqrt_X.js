/**
 * @param {number} x
 * @return {number}
 */
const mySqrt = function (x) {
    let left = 1;
    let right = Math.floor(x / 2) + 1;
    let mid;

    while (left <= right) {
        mid = Math.floor((left + right) / 2);

        if (mid * mid > x) {
            right = mid - 1;
        } else if (mid * mid < x) {
            left = mid + 1;
        } else {
            return mid;
        }
    }

    return right;
};