from transformers import BartTokenizer, BartForConditionalGeneration

model = BartForConditionalGeneration.from_pretrained('facebook/bart-large-cnn')
tokenizer = BartTokenizer.from_pretrained('facebook/bart-large-cnn')

file_path = 'CV - GUY MBEREBE GUIDONA.txt'

with open(file_path, 'r') as file:
    input_text = file.read()

inputs = tokenizer.encode(input_text, return_tensors='pt', truncation=True, max_length=1024)

summary_ids = model.generate(inputs['input_ids'], num_beams=4, max_length=100, early_stopping=True)
summary = tokenizer.decode(summary_ids[0], skip_special_tokens=True)

print(summary)


