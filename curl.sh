#!/bin/bash
URL="http://localhost:8080/authorize"

echo -e "\n\n\n *** admin:qwerty gets all permissions ***\n"
curl -v "${URL}?user=admin&password=qwerty"

echo -e "\n\n\n *** reader:123 gets only read permissions ***\n"
curl -v "${URL}?user=reader&password=123"

echo -e "\n\n\n *** empty parameter leads to error 400 ***\n"
curl -v "${URL}?user=&password=qwerty"

echo -e "\n\n\n *** nonexistent user leads to error 401 ***\n"
curl -v "${URL}?user=qwerty&password=qwerty"
