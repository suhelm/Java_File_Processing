FILE PROCESSING JAVA CODES.

1. can take any number of files and print no of lines, words, characters.
2. Can print help, banner
3. Can understand if verbose is requested.
4. Can parse command line , for example
        java wc line -bhv <fileName> Will only print line number of the file in verbose mode and print a banner ,help manual,
5. Command Help
  
Usage : usage: wc  [comm] [-hbv] [file ...]
char : Character Count
word : Word Count
line : Line Count
- -
-h : Print Helps
-b : Print Banner
-v : Print Verbose output
- -
- Example -
 wc  word -v  <file name(s)
 wc  char -vbh  <file name(s)
 wc  line -help -v -banner <file name(s)>
