float is IEEE 754 single precision
32 bits

bit 0 is the sign  bit (0 = positive number, 1 = negative number)
---
next 8 bits are the exponent
exponents allow range of 0 to 255, but everything is shifted down 127 bits in calculations so actual range is +128 to -127
example: to get exponent of 4, set e to 0b10000011 (= 0d131), not to 0b00000100 (= 0d4).
---
last 23 bits are the mantissa (implicit first bit really brings it to 24)

bits = 2^23 * E + M
actual number = (1 + ( M / (2^23) ) ) * 2^(E-127)


NOTE: IEEE 754 has special handling for exponents of -127 and +128!!!!
--------
program:
 first bin by bit 0 (at the end of the program, concatenate the bins with the bit-0-toggled-on bin coming first)


----------------------
table

M^E
