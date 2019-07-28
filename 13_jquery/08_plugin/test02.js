(function ($) {
    let changeComma = function (val) {
        val = val.toString().replace(/,/g, "");
        let pattern = /(^[+-]?\d+)(\d{3})/;
        while (pattern.test(val)) {
            val = val.replace(pattern, "$1" + "," + "$2");
        }
        return val;
    };

    // 12,345,566
    // console.log( changeComma(-12345566) );
    // console.log( changeComma(+12345566) );
    // console.log( changeComma(12345566) );

    $.fn.comma = function () {
        let ele = this;
        this.keyup(function () {
            ele.val(changeComma(ele.val()));
        });
    };
})(jQuery);