#!/bin/bash -x

read -p "length of array " l

for (( i=0; i<l; i++ ))
do
  read -a "elements" elements[$i]
done

maximum=${elements[0]}
minimum=${elements[0]}

for (( i=0; i<l; i++))
do

   if [[ ${elements[$i]} -gt $maximum ]]
   then
      maximum=${elements[$i]}

   elif [[ ${elements[$i]} -lt $minimum ]]
   then
      minimum=${elements[$i]}
   fi
done

echo "maximum is $maximum"
echo "minimum is $minimum"
