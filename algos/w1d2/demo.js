var n1 = {
    value: 11,
    next: null
}

var n2 = {
    value: 22,
    next: null
}

var n3 = {
    value: 33,
    next: null
}

n1.next = n2;
n2.value = 100;
console.log({n1})
