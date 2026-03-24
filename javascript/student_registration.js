// studentRegistration.js

const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

readline.question("Enter student name: ", (name) => {
    readline.question("Enter number of registered units: ", (units) => {
        units = Number(units);

        let status;
        if (units > 7) {
            status = "Overload - Approval Required";
        } else {
            status = "Registration Accepted";
        }

        console.log("\n--- REGISTRATION SUMMARY ---");
        console.log("Student Name:", name);
        console.log("Units:", units);
        console.log("Status:", status);

        readline.close();
    });
});