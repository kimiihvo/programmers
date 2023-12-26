성분으로 구분한 아이스크림 총 주문량

문제 설명

다음은 아이스크림 가게의 상반기 주문 정보를 담은 FIRST_HALF 테이블과 아이스크림 성분에 대한 정보를 담은 ICECREAM_INFO 테이블입니다. FIRST_HALF 테이블 구조는 다음과 같으며, SHIPMENT_ID, FLAVOR, TOTAL_ORDER 는 각각 아이스크림 공장에서 아이스크림 가게까지의 출하 번호, 아이스크림 맛, 상반기 아이스크림 총주문량을 나타냅니다. FIRST_HALF 테이블의 기본 키는 FLAVOR입니다.

NAMETYPENULLABLESHIPMENT_IDINT(N)FALSEFLAVORVARCHAR(N)FALSETOTAL_ORDERINT(N)FALSE

ICECREAM_INFO 테이블 구조는 다음과 같으며, FLAVOR, INGREDITENT_TYPE 은 각각 아이스크림 맛, 아이스크림의 성분 타입을 나타냅니다. INGREDIENT_TYPE에는 아이스크림의 주 성분이 설탕이면 sugar_based라고 입력되고, 아이스크림의 주 성분이 과일이면 fruit_based라고 입력됩니다. ICECREAM_INFO의 기본 키는 FLAVOR입니다. ICECREAM_INFO테이블의 FLAVOR는 FIRST_HALF 테이블의 FLAVOR의 외래 키입니다.

NAMETYPENULLABLEFLAVORVARCHAR(N)FALSEINGREDIENT_TYPEVARCHAR(N)FALSE문제

상반기 동안 각 아이스크림 성분 타입과 성분 타입에 대한 아이스크림의 총주문량을 총주문량이 작은 순서대로 조회하는 SQL 문을 작성해주세요. 이때 총주문량을 나타내는 컬럼명은 TOTAL_ORDER로 지정해주세요.

예시

예를 들어 FIRST_HALF 테이블이 다음과 같고

SHIPMENT_IDFLAVORTOTAL_ORDER101chocolate3200102vanilla2800103mint_chocolate1700104caramel2600105white_chocolate3100106peach2450107watermelon2150108mango2900109strawberry3100110melon3150111orange2900112pineapple2900

ICECREAM_INFO 테이블이 다음과 같다면

FLAVORINGREDIENT_TYPEchocolatesugar_basedvanillasugar_basedmint_chocolatesugar_basedcaramelsugar_basedwhite_chocolatesugar_basedpeachfruit_basedwatermelonfruit_basedmangofruit_basedstrawberryfruit_basedmelonfruit_basedorangefruit_basedpineapplefruit_based

상반기에 아이스크림의 주 성분이 설탕인 아이스크림들에 대한 총주문량을 구하면 3,200 + 2,800 + 1,700 + 2,600 + 3,100 = 13,400입니다. 아이스크림의 주 성분이 과일인 아이스크림들에 대한 총주문량을 구하면 3,100 + 2,450 + 2,150 + 2,900 + 3,150 + 2,900 + 2,900 = 19,550입니다. 따라서 총주문량이 작은 순서대로 조회하는 SQL 문을 실행하면 다음과 같이 나와야 합니다.

INGREDIENT_TYPETOTAL_ORDERsugar_based13400fruit_based19550

