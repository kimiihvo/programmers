SELECT ANIMAL_ID, NAME,
        CASE
        WHEN REGEXP_LIKE (SEX_UPON_INTAKE, 'Neutered|Spayed') THEN 'O'
        ELSE 'X'
        END as �߼�ȭ
FROM ANIMAL_INS 
    ORDER BY ANIMAL_ID