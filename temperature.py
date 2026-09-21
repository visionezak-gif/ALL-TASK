
for index in range(5):
    celcius = float(input('Enter temperature:'))    
    temperature = celcius + index

if temperature < -273:
    print('impossible')
else:
    fahrenheit = (celcius * 9/5) + 32
    print(fahrenheit)





