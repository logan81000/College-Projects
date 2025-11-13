year = input("What year is your Ferrari 250 GTO? ")
year = int(year)
if(year >= 1962 and year <= 1964):
    print("Your car is worth $18,500")
    exit()
if (year >= 1965 and year <= 1968):
    print("Your car is worth $6,000")
    exit()

if (year >= 1969 and year <= 1971):
    print("Your car is worth $12,000")
    exit()

if (year >= 1972 and year <= 1975):
    print("Your car is worth $48,000")
    exit()

if (year >= 1976 and year <= 1980):
    print("Your car is worth $200,000")
    exit()

if (year >= 1981 and year <= 1985):
    print("Your car is worth $650,000")
    exit()

if (year >= 1986 and year <= 2012):
    print("Your car is worth $35,000,000")
    exit()


if (year >= 2013 and year <= 2014):
    print("Your car is worth $52,000,000")
    exit()

print("invalid input")
