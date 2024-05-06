import React from "react";

const ExpenseForm = () => {
  const [amount, setAmount] = useState("");
  const [date, setDate] = useState("");
  const [merchant, setMerchant] = useState("");
  const [paymentMethod, setPaymentMethod] = useState("");
  const [budgetCategory, setBudgetCategory] = useState("");
  const [description, setDescription] = useState("");

  const handleSubmit = (e) => {
    e.preventDefault();
    const expenseData = {
      amount,
      date,
      merchant,
      paymentMethod,
      budgetCategory,
      description,
    };
    console.log("Expense data:", expenseData);
  };

  return (
    <form onSubmit={handleSubmit}>
      <input
        type="number"
        value=""
        placeholder="Amount"
        onChange={(e) => setAmount(e.target.value)}
      />
      <input
        type="date"
        value=""
        placeholder="Date"
        onChange={(e) => setDate(e.target.value)}
      />
      <input
        type="text"
        value=""
        placeholder="Merchant"
        onChange={(e) => setMerchant(e.target.value)}
      />
      <input
        type="text"
        value=""
        placeholder="Payment Method"
        onChange={(e) => setPaymentMethod(e.target.value)}
      />
      <input
        type="text"
        value=""
        placeholder="Budget Category"
        onChange={(e) => setBudgetCategory(e.target.value)}
      />
      <input
        type="text"
        value=""
        placeholder="Description"
        onChange={(e) => setDescription(e.target.value)}
      />
      <button type="submit">Add</button>
    </form>
  );
};

export default ExpenseForm;
