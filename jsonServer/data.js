module.exports = () => {
    const data = {
        products:[]
    }
    for(let i = 0; i < 1000; i++){
        data.products.push({
            id:i,
            title:`product ${i}`,
            description: `description about product ${i}`,
            price: (Math.round(Math.random()* 6) + 1) * 150
        })
    }

    return data
}