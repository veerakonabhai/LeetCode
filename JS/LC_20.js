/* 
 * Leet code problem 20 - Valid parenthesis
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']'
 * determine if the input string is valid. An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * return boolean
 * 
 * Input: s = "{[]}"
 * Output: true
 * Input: s = "(]"
 * Output: false
 */

/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function (s) {
    //for odd length return false
    if(s.length%2 !==0) return false
    
    const resultStack = [];
    /* //here we check and add all open brackets into stack
    for (let i = 0; i < s.length; i++) {
        let char = s[i];
        if (char === '(' || char === '{' || char === '['){
            resultStack.push(char); //adding all open one's into stack
        }else{
            returnedChar = resultStack.pop(); //when a closed one is there we pop the recent added open
            if(returnedChar === '(' && char !== ')') return false;
            if(returnedChar === '{' && char !== '}') return false;
            if(returnedChar === '[' && char !== ']') return false;
            //if no open were added when checking for closed or if string had only closed ones then pop() would return undefined
            if(returnedChar === undefined) return false;
        }
    }
    return resultStack.length === 0; */

    for (let index = 0; index < s.length; index++) {
        const char = s[index];
        //for each open bracket add it's respective closed bracket into stack
        /* if(char === '('){
            resultStack.push(')');
        }else if(char === '{'){
            resultStack.push('}');
        }else if(char === '['){
            resultStack.push(']');
        }else{
            if(char !== resultStack.pop()){
                return false;
            }
        } */
        switch (char) {
            case '(':
                resultStack.push(')');
                break;
            case '{':
                resultStack.push('}');
                break;
            case '[':
                resultStack.push(']');
                break;
            default:
                if(char !== resultStack.pop()) return false;
                break;
        }
    }
    return (resultStack.length === 0);
};

console.log(isValid('{[]}()')); //true
console.log(isValid('{[]})(')); //false
console.log(isValid('{(')); //false
console.log(isValid(')}]')); //false