Feature: Booking a product using Netlify application

Scenario: User need to book the product in Netlify application.
Given User needs to launch the Netlifybrowser.
When User selects Shopnow option
And Select Products under Hair Products options
And Select Hair beauty bath product
And Click on Add to Cart button 
And Click on cart button once product visible after selecting
And Click on Checkout button
And Select Shipping button on Cart checkout page
And Click on Make payment option once visibled
Then Print the receipt number for the selected product.