package com.app.catalog.data.db

import com.app.catalog.R
import com.app.catalog.data.entity.Catalog
import com.app.catalog.data.entity.CatalogRange
import com.app.catalog.data.entity.CatalogType

class DataStore {

    val animalSubItems = listOf(
        CatalogRange(R.drawable.thumbnail_animal,"Tiger", "The tiger is a large cat species."),
        CatalogRange(R.drawable.thumbnail_animal,"Lion", "The lion is known as the king of the jungle."),
        CatalogRange(R.drawable.thumbnail_animal,"Elephant", "Elephants are the largest land animals."),
        CatalogRange(R.drawable.thumbnail_animal,"Giraffe", "Giraffes are the tallest mammals on Earth."),
        CatalogRange(R.drawable.thumbnail_animal,"Zebra", "Zebras are African equids with distinctive black-and-white striped coats."),
        CatalogRange(R.drawable.thumbnail_animal,"Monkey", "Monkeys are primates known for their intelligence."),
        CatalogRange(R.drawable.thumbnail_animal,"Panda", "Pandas are bear species known for their black and white fur."),
        CatalogRange(R.drawable.thumbnail_animal,"Kangaroo", "Kangaroos are marsupials from Australia."),
        CatalogRange(R.drawable.thumbnail_animal,"Leopard", "Leopards are large felines known for their spotted coats."),
        CatalogRange(R.drawable.thumbnail_animal,"Cheetah", "Cheetahs are the fastest land animals."),
        CatalogRange(R.drawable.thumbnail_animal, "Bear", "Bears are large mammals found in various regions."),
        CatalogRange(R.drawable.thumbnail_animal, "Wolf", "Wolves are wild canines known for their pack behavior."),
        CatalogRange(R.drawable.thumbnail_animal, "Eagle", "Eagles are large birds of prey with strong talons."),
        CatalogRange(R.drawable.thumbnail_animal, "Penguin", "Penguins are flightless birds adapted to aquatic life."),
        CatalogRange(R.drawable.thumbnail_animal, "Seal", "Seals are marine mammals known for their agility in water."),
        CatalogRange(R.drawable.thumbnail_animal, "Otter", "Otters are playful aquatic mammals with sleek bodies."),
        CatalogRange(R.drawable.thumbnail_animal, "Hippopotamus", "Hippos are large semi-mammals with large mouths."),
        CatalogRange(R.drawable.thumbnail_animal, "Rhino", "Rhinoceroses are large mammals with thick skin and horns."),
        CatalogRange(R.drawable.thumbnail_animal, "Walrus", "Walruses are marine mammals known for their tusks and whiskers."),
        CatalogRange(R.drawable.thumbnail_animal, "Koala", "Koalas are marsupials native to Australia, known for their eucalyptus diet.")
    )

    val vegetableSubItems = listOf(
        CatalogRange(R.drawable.thumbnail_vegetable,"Spinach", "Spinach is a leafy green vegetable."),
        CatalogRange(R.drawable.thumbnail_vegetable,"Carrot", "Carrots are root vegetables usually orange in color."),
        CatalogRange(R.drawable.thumbnail_vegetable,"Broccoli", "Broccoli is an edible green plant in the cabbage family."),
        CatalogRange(R.drawable.thumbnail_vegetable,"Cauliflower", "Cauliflower is a vegetable that looks like white broccoli."),
        CatalogRange(R.drawable.thumbnail_vegetable,"Potato", "Potatoes are starchy tubers."),
        CatalogRange(R.drawable.thumbnail_vegetable,"Tomato", "Tomatoes are botanically classified as fruits."),
        CatalogRange(R.drawable.thumbnail_vegetable,"Pepper", "Peppers come in various colors, such as red, green, and yellow."),
        CatalogRange(R.drawable.thumbnail_vegetable,"Cucumber", "Cucumbers are refreshing and often used in salads."),
        CatalogRange(R.drawable.thumbnail_vegetable,"Onion", "Onions are pungent vegetables used in many dishes."),
        CatalogRange(R.drawable.thumbnail_vegetable,"Garlic", "Garlic is known for its strong flavor and health benefits."),
        CatalogRange(R.drawable.thumbnail_vegetable, "Lettuce", "Lettuce is a leafy green vegetable often used in salads."),
        CatalogRange(R.drawable.thumbnail_vegetable, "Radish", "Radishes are root vegetables with a crisp texture."),
        CatalogRange(R.drawable.thumbnail_vegetable, "Beetroot", "Beetroots are root vegetables with a deep red color."),
        CatalogRange(R.drawable.thumbnail_vegetable, "Sweet Corn", "Sweet corn is a popular vegetable with a high sugar content."),
        CatalogRange(R.drawable.thumbnail_vegetable, "Pumpkin", "Pumpkins are large, orange fruits used in various dishes."),
        CatalogRange(R.drawable.thumbnail_vegetable, "Zucchini", "Zucchinis are summer squashes used in a variety of dishes."),
        CatalogRange(R.drawable.thumbnail_vegetable, "Brussels Sprouts", "Brussels sprouts are small cabbage-like vegetables."),
        CatalogRange(R.drawable.thumbnail_vegetable, "Kale", "Kale is a leafy green vegetable known for its nutritional benefits."),
        CatalogRange(R.drawable.thumbnail_vegetable, "Artichoke", "Artichokes are thistle-like vegetables with edible buds."),
        CatalogRange(R.drawable.thumbnail_vegetable, "Celery", "Celery is a crunchy vegetable often used in soups and salads.")
    )

    val fruitSubItems = listOf(
        CatalogRange(R.drawable.thumbnail_fruits,"Apple", "Apples are sweet and come in various colors."),
        CatalogRange(R.drawable.thumbnail_fruits,"Banana", "Bananas are long and yellow tropical fruits."),
        CatalogRange(R.drawable.thumbnail_fruits,"Orange", "Oranges are citrus fruits known for their vitamin C."),
        CatalogRange(R.drawable.thumbnail_fruits,"Grapes", "Grapes are small, juicy fruits that grow in clusters."),
        CatalogRange(R.drawable.thumbnail_fruits,"Mango", "Mangoes are tropical stone fruits with sweet flesh."),
        CatalogRange(R.drawable.thumbnail_fruits,"Pineapple", "Pineapples have a tough, spiky exterior and sweet interior."),
        CatalogRange(R.drawable.thumbnail_fruits,"Strawberry", "Strawberries are red, juicy fruits with tiny seeds on the outside."),
        CatalogRange(R.drawable.thumbnail_fruits,"Blueberry", "Blueberries are small, sweet blue fruits."),
        CatalogRange(R.drawable.thumbnail_fruits,"Watermelon", "Watermelons are large fruits with green rind and red flesh."),
        CatalogRange(R.drawable.thumbnail_fruits,"Peach", "Peaches are juicy fruits with fuzzy skin."),
        CatalogRange(R.drawable.thumbnail_fruits, "Pomegranate", "Pomegranates are fruits with juicy seeds and a tangy flavor."),
        CatalogRange(R.drawable.thumbnail_fruits, "Kiwi", "Kiwis are small fruits with a green interior and a fuzzy brown skin."),
        CatalogRange(R.drawable.thumbnail_fruits, "Papaya", "Papayas are tropical fruits with sweet, orange flesh."),
        CatalogRange(R.drawable.thumbnail_fruits, "Raspberry", "Raspberries are small, red fruits with a tart flavor."),
        CatalogRange(R.drawable.thumbnail_fruits, "Blackberry", "Blackberries are dark, juicy berries with a sweet-tart taste."),
        CatalogRange(R.drawable.thumbnail_fruits, "Fig", "Figs are sweet fruits with a chewy skin and seeds."),
        CatalogRange(R.drawable.thumbnail_fruits, "Date", "Dates are sweet, chewy fruits often used in desserts."),
        CatalogRange(R.drawable.thumbnail_fruits, "Plum", "Plums are stone fruits with a sweet or tart flavor."),
        CatalogRange(R.drawable.thumbnail_fruits, "Cherry", "Cherries are small, round fruits with a sweet or tart taste."),
        CatalogRange(R.drawable.thumbnail_fruits, "Apricot", "Apricots are small, orange fruits with a sweet, tangy flavor.")

    )

    val carSubItems = listOf(
        CatalogRange(R.drawable.thumbnail_car,"Tesla", "Tesla is known for electric cars."),
        CatalogRange(R.drawable.thumbnail_car,"BMW", "BMW is a luxury German automaker."),
        CatalogRange(R.drawable.thumbnail_car,"Audi", "Audi is a premium German automobile manufacturer."),
        CatalogRange(R.drawable.thumbnail_car,"Mercedes", "Mercedes-Benz is a global luxury car brand."),
        CatalogRange(R.drawable.thumbnail_car,"Ford", "Ford is an American multinational automaker."),
        CatalogRange(R.drawable.thumbnail_car,"Chevrolet", "Chevrolet is a division of General Motors."),
        CatalogRange(R.drawable.thumbnail_car,"Honda", "Honda is a Japanese public multinational conglomerate."),
        CatalogRange(R.drawable.thumbnail_car,"Toyota", "Toyota is a Japanese automotive manufacturer."),
        CatalogRange(R.drawable.thumbnail_car,"Nissan", "Nissan is a Japanese automobile manufacturer."),
        CatalogRange(R.drawable.thumbnail_car,"Hyundai", "Hyundai is a South Korean multinational automotive manufacturer."),
        CatalogRange(R.drawable.thumbnail_car, "Lexus", "Lexus is a luxury vehicle division of Toyota."),
        CatalogRange(R.drawable.thumbnail_car, "Jaguar", "Jaguar is a British luxury car manufacturer."),
        CatalogRange(R.drawable.thumbnail_car, "Porsche", "Porsche is a German automobile manufacturer known for high-performance sports cars."),
        CatalogRange(R.drawable.thumbnail_car, "Land Rover", "Land Rover is known for its rugged and luxurious off-road vehicles."),
        CatalogRange(R.drawable.thumbnail_car, "Subaru", "Subaru is a Japanese automaker known for its all-wheel-drive vehicles."),
        CatalogRange(R.drawable.thumbnail_car, "Mazda", "Mazda is a Japanese automaker known for its sporty cars and innovative technology."),
        CatalogRange(R.drawable.thumbnail_car, "Chrysler", "Chrysler is an American automaker with a range of cars and SUVs."),
        CatalogRange(R.drawable.thumbnail_car, "Jeep", "Jeep is known for its off-road vehicles and rugged design."),
        CatalogRange(R.drawable.thumbnail_car, "Buick", "Buick is an American brand known for its premium vehicles."),
        CatalogRange(R.drawable.thumbnail_car, "Acura", "Acura is the luxury vehicle division of Honda.")
    )

    val bikeSubItems = listOf(
        CatalogRange(R.drawable.thumbnail_bike,"Harley-Davidson", "Harley-Davidson is an American motorcycle manufacturer."),
        CatalogRange(R.drawable.thumbnail_bike,"Ducati", "Ducati is an Italian motorcycle manufacturer."),
        CatalogRange(R.drawable.thumbnail_bike,"Yamaha", "Yamaha is a Japanese manufacturer of motorcycles."),
        CatalogRange(R.drawable.thumbnail_bike,"Kawasaki", "Kawasaki is a Japanese manufacturer of motorcycles and ATVs."),
        CatalogRange(R.drawable.thumbnail_bike,"Suzuki", "Suzuki is a Japanese manufacturer of motorcycles and automobiles."),
        CatalogRange(R.drawable.thumbnail_bike,"BMW Motorrad", "BMW Motorrad is the motorcycle brand of BMW."),
        CatalogRange(R.drawable.thumbnail_bike,"Triumph", "Triumph Motorcycles is the largest UK motorcycle manufacturer."),
        CatalogRange(R.drawable.thumbnail_bike,"Royal Enfield", "Royal Enfield is an Indian multinational motorcycle manufacturer."),
        CatalogRange(R.drawable.thumbnail_bike,"KTM", "KTM is an Austrian manufacturer of motorcycles and sports cars."),
        CatalogRange(R.drawable.thumbnail_bike,"Honda", "Honda is known for its motorcycles, cars, and power equipment."),
        CatalogRange(R.drawable.thumbnail_bike, "MV Agusta", "MV Agusta is an Italian motorcycle manufacturer known for high-performance bikes."),
        CatalogRange(R.drawable.thumbnail_bike, "Buell", "Buell is an American motorcycle brand known for innovative designs."),
        CatalogRange(R.drawable.thumbnail_bike, "Husqvarna", "Husqvarna is a Swedish brand known for its off-road and dual-sport motorcycles."),
        CatalogRange(R.drawable.thumbnail_bike, "Benelli", "Benelli is an Italian motorcycle manufacturer with a range of bikes."),
        CatalogRange(R.drawable.thumbnail_bike, "Moto Guzzi", "Moto Guzzi is an Italian motorcycle manufacturer known for its unique V-twin engines."),
        CatalogRange(R.drawable.thumbnail_bike, "Aprilia", "Aprilia is an Italian motorcycle manufacturer known for its racing bikes."),
        CatalogRange(R.drawable.thumbnail_bike, "Norton", "Norton is a British motorcycle manufacturer with a rich history."),
        CatalogRange(R.drawable.thumbnail_bike, "BSA", "BSA is a British motorcycle brand known for classic bikes."),
        CatalogRange(R.drawable.thumbnail_bike, "Indian Motorcycle", "Indian Motorcycle is an American brand known for its heavyweight cruisers."),
        CatalogRange(R.drawable.thumbnail_bike, "MOTO3", "MOTO3 is a brand specializing in affordable, lightweight motorcycles.")

    )


    val catalogList = listOf(
        Catalog(R.drawable.animal, CatalogType.ANIMAL),
        Catalog(R.drawable.vegetable, CatalogType.VEGETABLE),
        Catalog(R.drawable.fruit, CatalogType.FRUIT),
        Catalog(R.drawable.car, CatalogType.CAR),
        Catalog(R.drawable.bike, CatalogType.BIKE)
    )



}