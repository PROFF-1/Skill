import {useState, useEffect} from 'react'
import axios from 'axios'

export const SuperHeroesPage = () => {

  const [isLoading, setIsLoading] =  useState(true);
  const [data, setData]= useState([])
  const [error, setError]= useState('')



  const fetchData = async () => {
    try{
      const result = await axios.get("http://localhost:4000/superheroes");
      setData(result.data);    
    }
    catch(error){
      setError(error.message)
    }
    finally{
      setIsLoading(false);
    }
  }


  useEffect(()=>{
    // axios.get("http://localhost:4000/superheroes")
    // .then((res)=>{
    //   setIsLoading(true)
    //   setData(res.data)
    //   setIsLoading(false)
    // })
    fetchData()
  },[])


  if (isLoading){
    return <h1>loading...</h1>
  }

  if(error){
    return <h2>{error}</h2>
  }

  return(
  <>
    {
      data.map((hero)=>{
        return <div key={hero.id}>{hero.name}</div>
      })
    }
  </>
  )

 
}