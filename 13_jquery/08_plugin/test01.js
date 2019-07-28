$.arr = function (obj, type) {

    let result;
    if (type == "sum") {
        let sum = 0;
        for (let val of obj) {
            sum += val;
        }
        result = sum;
    } else if (type == "max") {
        let max = obj[0];
        for (let i = 1; i < obj.length; i++) {
            if (obj[i] < max) continue;
            max = obj[i];
        }
        result = max;
    }

    return result;
};