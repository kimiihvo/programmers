SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS 
    WHERE lower(NAME) LIKE lower('%el%')
    AND ANIMAL_TYPE = 'Dog'
    ORDER BY NAME