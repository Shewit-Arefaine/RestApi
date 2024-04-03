const btn = document.querySelector(".get-quotes");
btn.addEventListener("click",getQuotes);
const number = document.getElementById("number");
const url = "https://type.fit/api/quotes";

function getQuotes(e){
    e.preventDefault();

    if(number.value.length==0){
        return alert("please enter a number");

    }else{
        fetch(url)
        .then(function(response){
            return response.json();
        })
        .then(function(data){
            // console.log(JSON.stringify(data));
            //suffling the data
            data = shuffle(data);

            let output = "";

            for(let i= 0; i < data.length; i++){

                if(i== number.value){break;}
                 output+= `
                <li> Quote: ${data[i].text} </li>
                <li> Author: ${data[i].author} </li>
                <hr> 
                `;
            
            }
            document.querySelector(".quotes").innerHTML = output;
        })

        
    }
}
function shuffle(quotes){
    let currentindex = quotes.length,tempValue, randomIndex;
    //while elemnts exist in the array
    while(currentindex>0){
        randomIndex = Math.floor(Math.random()*currentindex);
        //dcerease the currentindex by 1
        currentindex--;
        //let swap the last element with currentindex
        tempValue = quotes[currentindex];
        quotes[currentindex]= quotes[randomIndex];
        quotes[randomIndex] = tempValue;
    }
    return quotes;
}
// i have an code that gets data locally from a json file using ajax. I awnt to optimize it to be able to make http request to exetrnal api.
//i want to able to get dat or source from a server using bot ajax and fetch api

//generate and ajax and fetch api code that is able to make http request externaly to a rest api
//the api should have the ability to manipulate the data request. 
