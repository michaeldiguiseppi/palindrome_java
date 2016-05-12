function palindrome (string) {
  var splitStr = string.toLowerCase().split('');
  var truth = [];
  var truthy = true;
  for (var i = 0; i < (splitStr.length - 1); i++) {
    for (var j = (splitStr.length - 1); j > 0; j--) {
      if (splitStr[i] !== splitStr[j]) {
        truthy = false;
      } else {
        truthy = true;
      }
    }
  }
  if (truthy) {
    console.log(string + ' is a palindrome');
  } else {
    console.log(string + ' is not a palindrome');
  }
}


palindrome('Racecar');
palindrome('Michael');
palindrome('Taco cat');
palindrome('Michael DiGuiseppi is awesome');
