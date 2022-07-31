function duplicateCount(text){
    if(text==null || text == ""){
        return 0;
    }
    const textLower = text.toLowerCase();

    let duplicate = [];

    const array = textLower.split('');
    console.log(array);
    const tempArray = [...array].sort();
    console.log(tempArray);

    for (let i = 0; i < tempArray.length; i++) {
        if(tempArray[i+1] == tempArray[i]){

            duplicate.push(tempArray[i]);
        }
    }
    console.log(duplicate)
    let output = [];
    output = [...new Set(duplicate)];
    console.log(output)
    return output.length;
}

const n = duplicateCount("Indivisibilities");
console.log(n);