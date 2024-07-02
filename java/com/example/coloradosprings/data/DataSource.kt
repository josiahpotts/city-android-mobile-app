package com.example.coloradosprings.data

import com.example.coloradosprings.R
import com.example.coloradosprings.model.Category
import com.example.coloradosprings.model.Item

object DataSource {
    val restaurants = Category(
        category = "Restaurants",
        items = listOf(
            Item("Bourbon Brothers BBQ", R.drawable.bourbon, "13021 Bass Pro Dr, Colorado Springs, CO 80921", "Delicious barbecue food, and excellent location because it is around fun places like Bass Pro Shop, Top Golf, and Indoor Skydiving."),
            Item("Vaqueros", R.drawable.mexi, "9605 Prominent Point, Colorado Springs, CO 80924", "Good Mexican food, plain and simple. They will treat you like family and feed you some delicious cuisine."),
            Item("Cowboy Star", R.drawable.star, "5198 N Nevada Ave #150, Colorado Springs, CO 80918", "Higher-end cuisine that is sure to delight. The beef tartare, bone marrow, and wagyu steak dishes are highly recommended."),
            Item("Urban Egg", R.drawable.egg, "28B S. Tejon St, Colorado Springs, CO 80903", "Brunch perfection! What out, though, Coloradans love brunch and it will be busy. Plenty of eccentric breakfast options and cozy coffee.")
        )
    )

    val coffee = Category(
        category = "Coffee",
        items = listOf(
            Item("The Wild Goose Meeting House", R.drawable.goose, "401 N Tejon St, Colorado Springs, CO 80903", "A welcoming spot with comfy seating and warm lighting, offering freshly brewed coffees and teas in a cozy setting."),
            Item("The Perk Downtown", R.drawable.perk, "14 S Tejon St, Colorado Springs, CO 80903", "A modern coffee shop in the heart of the city, serving up delicious drinks in a vibrant atmosphere."),
            Item("The Principal's Office", R.drawable.principal, "1604 S Cascade Ave, Colorado Springs, CO 80905", "A lively gathering place where locals come together to enjoy artisanal coffees and engage in conversation."),
            Item("Jives Coffee Lounge", R.drawable.jives, "16 Colbrunn Ct, Colorado Springs, CO 80904", " A must-visit destination for coffee lovers, offering a variety of espresso drinks and handcrafted brews to satisfy every palate.")
        )
    )

    val activities = Category(
        category = "Activities",
        items = listOf(
            Item("Garden of the Gods", R.drawable.garden, "1805 N. 30th Street Colorado Springs, CO 80904", "Astonishing natural beauty. Prepare for a bit of walking though, as there are vast trails that can take you through the whole scenic park."),
            Item("Top Golf", R.drawable.topgolf, "165 Spectrum Loop, Colorado Springs, CO 80921", "We all know Top Golf, and it is highly recommended anywhere. Enjoy some delicious food and smack some golf balls as hard as possible."),
            Item("Pikes Peak", R.drawable.pikes, "5089 Pikes Peak Highway, Cascade, CO 80809", "Drive up the mountains to Colorado Springs' much treasured Pikes Peak. There are viewing areas that provide a perfect scene."),
            Item("U.S. Olympic & Paralympic Museum", R.drawable.olympic, "200 S Sierra Madre St, Colorado Springs, CO 80903", "Colorado Springs is world famous for their Olympic training facilities, and the museum is just as much of a 'must-see'!")
        )
    )

    val allCategories = listOf(restaurants, coffee, activities)
}


