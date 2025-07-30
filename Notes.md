### Notes
- for-loops can have more than one condition
- 'else' is not always needed
- iterate from second char if comparing chars is required to avoid index out of bounds exception
  - for (int i = 1; i < S.length(); i++) {if (currChar == S.charAt(i-1))}
  - instead of from 1st char
  - for (int i = 0; i < S.length(); i++) {if (currChar == S.charAt(i+1))}
- use while (true) when an exact loop limit is unknown