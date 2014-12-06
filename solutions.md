Regex for PAN

    [3-6][0-9]{13,18}

Regex for track 2 data

    [3-6][0-9]{13,18}=[0-9]{4,}

When hunting in a binary file use [strings](http://linux.die.net/man/1/strings) first:

    strings haystack |egrep '[3-6][0-9]{13,18}'

