SELECT CAR_TYPE, count(*) CARS

FROM CAR_RENTAL_COMPANY_CAR 

    WHERE OPTIONS LIKE('%��Ʈ%')

    GROUP BY CAR_TYPE

    ORDER BY CAR_TYPE