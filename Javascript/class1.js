// 1.	Take a sentence as an input and reverse every word in that sentence. Example - This is a sunny day > shiT si a ynnus yad.

function reverseWordsInSentence(sentence) {
    let words = sentence.split(' ');

    let reversedWords = words.map(function(word) {
        return word.split('').reverse().join('');
    });

    let reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}
const inputSentence = "This is a sunny day";
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence);

// o/p -->sihT si a ynnus yad