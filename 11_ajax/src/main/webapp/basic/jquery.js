var $ = mlec;

function mlec(val) {
    if (typeof (val) === "function") {
        window.onload = val;
        return;
    }

    var element = [];

    if (val instanceof HTMLElement) {
        element[0] = val;
    } else {
        switch (val.charAt(0)) {
            case "<":
                element[0] = 
                    document.createElement( val.substring(1, val.length - 1) );
                break;
            default:
                for (let el of document.querySelectorAll(val)) {
                    element.push(el);
                }
        }    
    }

    element.prop = function (name, value) {
        if (value != undefined) {
            for (let el of this) {
                el[name] = value;
            }
            return this;
        }
        return this[0][name];
    };

    element.remove = function () {
        for (let el of this) {
            el.remove();
        }
    };

    element.append = function (childs) {
        for (let el of this) {

            for (let child of childs) {
                el.appendChild(child.cloneNode(true));
            }

        }
        return this;
    };

    element.css = function (name, value) {
        if (typeof (name) === "object") {
            for (let el of this) {

                for (let key in name) {
                    el.style[key] = name[key];
                }

            }
            return this;
        }

        if (value != undefined) {
            for (let el of this) {
                el.style[name] = value;
            }
            return this;
        }

        return this[0].style[name];    
    };

    element.attr = function (name, value) {
        if (typeof (name) === "object") {
            for (let el of this) {

                for (let key in name) {
                    el.setAttribute(key, name[key]);
                }

            }
            return this;
        }

        if (value != undefined) {
            for (let el of this) {
                el.setAttribute(name, value);
            }
            return this;
        }

        return this[0].getAttribute(name);    
    };

    element.click = function (cb) {
        return this.on("click", cb);
    };

    element.mousemove = function (cb) {
        return this.on("mousemove", cb);
    };

    element.on = function (eventType, cb) {
        for (let el of this) {
            el.addEventListener(eventType, cb);
        }
        return this;
    };

    element.val = function (value) {
        if (value != undefined) {
            for (let el of this) {
                el.value = value;
            }
            return this;
        }

        return this[0].value;
    };

    element.html = function (html) {
        if (html != undefined) {
            for (let el of this) {
                el.innerHTML = html;
            }
            return this;
        }
        
        return this[0].innerHTML;
    };

    element.text = function (text) {
        if (text != undefined) {
            for (let el of this) {
                el.innerText = text;
            }
            return this;
        }
        let result = "";
        for (let el of this) {
            result += el.innerText + "\n";
        }
        return result;
    };

    return element;
}

/*
 *   options
 *   url : 호출할 페이지
 *   type : 요청방식 지정, GET, POST
 *   data : 파라미터, id=aaa
 *   dataType : 서버의 결과를 객체로 변환(json 일 경우)
 *   success : 성공시 사용자가 처리할 일을 지정(function)
 * 
 */
$.ajax = function (options) {
	/*
	$.ajax({
		url: "test05.do",
		dataType: "json",
		data: "id=hong&msg=hello",
		data: {id: "hong", msg: "hello"},
		success: function (data) {
			$("#result").html(data);
		}
	});
	*/
	let xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function () {
		if (xhr.readyState == 4) {
			if (xhr.status == 200) {
				let result = xhr.responseText;
				if (options.dataType == "json") {
					result = JSON.parse(xhr.responseText);
				}
				options.success(result);
			}
		}
	};
	
	let method = options.type ? options.type : "GET";
	if (method != "GET" && method != "POST") method = "GET";
	
	/*
		data: "id=hong&msg=hello"
		data: {id: "hong", msg: "hello"}
	 */
	let params = "";
	if (options.data) {
		if (typeof (options.data) === "string") {
			// data: "id=hong&msg=hello"
			params = options.data;
		} else {
			// data: {id: "hong", msg: "hello"}
			for (let key in options.data) {
				if (params != "") {
					params += "&";
				}
				params += `${key}=${options.data[key]}`;
			} 
		}
	}
	
	// GET 방식이면서 params가 존재한다면
	let url = options.url;
	if (method == "GET" && params != "") {
		url += "?" + params;
	}
	
	xhr.open(method, url, true);
	
	if (method == "POST") {		
		xhr.setRequestHeader(
				"Content-Type", "application/x-www-form-urlencoded"
		);
	}
	
	xhr.send(method == "POST" ? params : null);
};




















